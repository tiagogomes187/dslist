package br.dev.tiagogomes.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BelongingPK {
	
	@ManyToOne
	@JoinColumn (name = "game_id")
	private Game game;
	
	@ManyToOne
	@JoinColumn (name = "list_id")
	private GameList list;
}
