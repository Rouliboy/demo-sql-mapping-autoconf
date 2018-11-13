package com.nexity.wgl.lib.utilctrl.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompteurPOJO {

	private String annee;

	private long valeur;

}
