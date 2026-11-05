package fr.pgah;

import java.awt.*;

public class TigreBlanc extends Bestiole {

  private boolean aInfecte;

  public Action getAction(BestioleInfo info) {
    if (info.getEnFace() == Voisin.AUTRE) {
      aInfecte = true;
      return Action.INFECTER;
    } else if (info.getEnFace() == Voisin.MUR || info.getADroite() == Voisin.MUR) {
      return Action.GAUCHE;
    } else if (info.getEnFace() == Voisin.MEME) {
      return Action.DROITE;
    } else {
      return Action.SAUTER;
    }
  }

  public Color getCouleur() {
    return Color.WHITE;
  }

  public String toString() {
    if (aInfecte) {
      return "B";
    } else {
      return "b";
    }
  }
}