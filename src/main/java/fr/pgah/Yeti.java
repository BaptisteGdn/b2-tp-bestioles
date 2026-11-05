package fr.pgah;

import java.awt.*;

public class Yeti extends Bestiole {

  private static final String[] SYMBOLES = {"Y", "E", "T", "I"};
  private static final int MOUVEMENTS_PAR_SYMBOLE = 6;

  private int mouvements;

  public Action getAction(BestioleInfo info) {
    mouvements = (mouvements + 1) % (MOUVEMENTS_PAR_SYMBOLE * SYMBOLES.length);

    if (info.getEnFace() == Voisin.AUTRE) {
      return Action.INFECTER;
    } else if (info.getEnFace() == Voisin.RIEN) {
      return Action.SAUTER;
    } else {
      return Action.DROITE;
    }
  }

  public Color getCouleur() {
    return Color.GRAY;
  }

  public String toString() {
    return SYMBOLES[mouvements / MOUVEMENTS_PAR_SYMBOLE];
  }
}