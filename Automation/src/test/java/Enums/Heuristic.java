package Enums;

import lombok.Getter;
@Getter
public enum Heuristic {

    ONE("Visibility of system status"),
    TWO("Match between system and the real world"),
    THREE("User control and freedom"),
    FOUR("Consistency and standards"),
    FIVE("Error prevention"),
    SIX("Recognition rather than recall"),
    SEVEN("Flexibility and efficiency of use"),
    EIGHT("Aesthetic and minimalist design"),
    NINE("Help users recognize, diagnose, and recover from errors"),
    TEN("Help and documentation");

    final private String description;
    Heuristic(String description){
        this.description =description;
    }
}