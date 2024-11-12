package br.dev.tiagogomes.dslist.dto;

import br.dev.tiagogomes.dslist.entities.Game;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO (Game entity) {
		id = entity.getId ();
		title = entity.getTitle ();
		year = entity.getYear ();
		imgUrl = entity.getImgUrl ();
		shortDescription = entity.getShortDescription ();
	}
}
