package br.dev.tiagogomes.dslist.dto;

import br.dev.tiagogomes.dslist.entities.GameList;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Data
@Getter
@Setter
@NoArgsConstructor
public class GameListDTO {
	
	private Long id;
	private String name;
	
	public GameListDTO (GameList entity) {
		BeanUtils.copyProperties (entity, this);
	}
	
}
