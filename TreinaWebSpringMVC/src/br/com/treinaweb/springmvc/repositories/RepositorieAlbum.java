package br.com.treinaweb.springmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.springmvc.domains.Album;

public interface RepositorieAlbum extends JpaRepository<Album, Long>{	

}
