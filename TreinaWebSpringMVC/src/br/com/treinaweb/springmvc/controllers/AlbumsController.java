package br.com.treinaweb.springmvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.treinaweb.springmvc.domains.Album;
import br.com.treinaweb.springmvc.repositories.RepositorieAlbum;

@Controller
@RequestMapping("/albums")
public class AlbumsController {

	@Autowired // Dependency Injection(CDI)
	private RepositorieAlbum repositorie;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Album> albums = repositorie.findAll();
		model.addAttribute("albums", albums);
		return "album.list.tiles";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(Model model) {
		model.addAttribute("album", new Album());
		return "album.add.tiles";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	// Warning: ALWAYS maintains a statement presented below, otherwise Error 400
	public String add(@ModelAttribute("album") @Valid Album newAlbum, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "album.add.tiles";
		}
		// model.addAttribute("album", newAlbum);
		repositorie.save(newAlbum);
		return "redirect:/albums/list";
	}

	@RequestMapping(value = "/alter/{id}", method = RequestMethod.GET)
	public String alter(@PathVariable("id") Long id, Model model) {
		Album albumChanged = repositorie.getOne(id);
		model.addAttribute("album", albumChanged);
		return "albums.alter.tiles";
	}
	
	@RequestMapping(value = "/alter", method = RequestMethod.POST)
	public String alter(@ModelAttribute("album") @Valid Album album, BindingResult result) {
		if (result.hasErrors()) {
			return "albums.alter.tiles";
		}
		repositorie.save(album);
		return "redirect:/albums/list";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") Long id) {
		repositorie.deleteById(id);
		return "redirect:/albums/list";
	}

}
