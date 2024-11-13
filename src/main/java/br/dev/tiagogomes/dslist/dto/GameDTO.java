package br.dev.tiagogomes.dslist.dto;

import br.dev.tiagogomes.dslist.entities.Game;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO (Game entity) {
		BeanUtils.copyProperties (entity, this);
	}
	
}
