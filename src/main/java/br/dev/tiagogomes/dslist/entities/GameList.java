package br.dev.tiagogomes.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "tb_game_list")
public class GameList {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
}
