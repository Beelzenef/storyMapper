package com.geekstorming.storymapper.data.pojo;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * Character entity, acting and moving!
 *
 * @author Elena Guzman Blanco (Beelzenef) - 3d10Mundos
 */

public class Character implements Parcelable, Comparable {

    // Atts

    public static final String TAG = "Character";

    int characterID;
    String characterName;
    String characterDesc;

    int characterFaction;
    int characterHome;
    int characterBook;

    // Getters + Setters

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterDesc() {
        return characterDesc;
    }

    public void setCharacterDesc(String characterDesc) {
        this.characterDesc = characterDesc;
    }

    public int getCharacterFaction() {
        return characterFaction;
    }

    public void setCharacterFaction(int characterFaction) {
        this.characterFaction = characterFaction;
    }

    public int getCharacterHome() {
        return characterHome;
    }

    public void setCharacterHome(int characterHome) {
        this.characterHome = characterHome;
    }

    public int getCharacterBook() {
        return characterBook;
    }

    public void setCharacterBook(int characterBook) {
        this.characterBook = characterBook;
    }

    // Constructor

    public Character(int characterID, String characterName, String characterDesc, int characterFaction, int characterHome, int characterBook) {
        this.characterID = characterID;
        this.characterName = characterName;
        this.characterDesc = characterDesc;
        this.characterFaction = characterFaction;
        this.characterHome = characterHome;
        this.characterBook = characterBook;
    }

    public Character(int characterID, String characterName, String characterDesc, int characterFaction, int characterHome) {
        this.characterID = characterID;
        this.characterName = characterName;
        this.characterDesc = characterDesc;
        this.characterFaction = characterFaction;
        this.characterHome = characterHome;
    }

    protected Character(Parcel in) {
        characterID = in.readInt();
        characterName = in.readString();
        characterDesc = in.readString();
        characterFaction = in.readInt();
        characterHome = in.readInt();
        characterBook = in.readInt();
    }

    // toString()

    @Override
    public String toString() {
        return "Character{" +
                "characterID=" + characterID +
                ", characterName='" + characterName + '\'' +
                ", characterDesc='" + characterDesc + '\'' +
                ", characterFaction=" + characterFaction +
                '}';
    }

    public static final Creator<Character> CREATOR = new Creator<Character>() {
        @Override
        public Character createFromParcel(Parcel in) {
            return new Character(in);
        }

        @Override
        public Character[] newArray(int size) {
            return new Character[size];
        }
    };

    // Parcelable methods

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(characterID);
        dest.writeString(characterName);
        dest.writeString(characterDesc);
        dest.writeInt(characterFaction);
        dest.writeInt(characterHome);
        dest.writeInt(characterBook);
    }

    @Override
    public int compareTo(@NonNull Object o) {
        return characterName.compareTo(((Character) o).getCharacterName());
    }
}
