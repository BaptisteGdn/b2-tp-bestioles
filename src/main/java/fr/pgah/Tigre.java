package fr.pgah;

import java.awt.*;

public class Tigre extends Bestiole {

    public Tigre() {
}

    private Color couleur;
    private int compteur = 0;

    public Action getAction(BestioleInfo info) {
    if (info.getEnFace() == Voisin.AUTRE) {
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
        if (compteur % 3 == 0) {
            int hasard = (int) (Math.random() * 3);
            if (hasard == 0) {
                couleur = Color.RED;
            } else if (hasard == 1) {
                couleur = Color.GREEN;
            } else {
                couleur = Color.BLUE;
            }
        }
        compteur++;
        return couleur;
    }

    public String toString() {
        return "G";
    }
}