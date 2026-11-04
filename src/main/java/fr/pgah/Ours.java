package fr.pgah;

import java.awt.*;

public class Ours extends Bestiole {

    private boolean polaire;
    private boolean slash = true;

    public Ours(boolean polaire) {
        this.polaire = polaire;
    }

    public Action getAction(BestioleInfo info) {
        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.RIEN) {
            return Action.SAUTER;
        } else {
            return Action.GAUCHE;
        }
    }

    public Color getCouleur() {
        if (polaire == true) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    public String toString() {
        String s;
        if (slash) {
            s = "/";
        } else {
            s = "\\";
        }
        slash = !slash;
        return s;
    }
}