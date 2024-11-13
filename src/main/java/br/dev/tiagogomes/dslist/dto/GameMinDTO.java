package br.dev.tiagogomes.dslist.dto;

import br.dev.tiagogomes.dslist.entities.Game;
import br.dev.tiagogomes.dslist.projections.GameMinProjection;
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
	
	public GameMinDTO (GameMinProjection projection) {
		id = projection.getId ();
		title = projection.getTitle ();
		year = projection.getGameYear ();
		imgUrl = projection.getImgUrl ();
		shortDescription = projection.getShortDescription ();
	}
}
