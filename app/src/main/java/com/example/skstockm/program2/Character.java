package com.example.skstockm.program2;

/**
 * Created by skstockm on 10/10/2017.
 */

public class Character {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Character[] CHARACTERs = {
            //character info from http://halo.wikia.com/
            new Character("Master Chief",
                    "Master Chief Petty Officer John-117, more commonly known as the Master Chief, " +
                            "is a SPARTAN-II commando of the UNSC Naval Special Warfare Command." +
                            " He is the protagonist and main character in both the Halo trilogy " +
                            "and Reclaimer Saga. With over thirty years of active duty, he has become" +
                            " one of the most decorated war veterans in the United Nations Space Command," +
                            " earning every known UNSC medal except the Prisoner of War Medallion. ", R.drawable.masterchief),
            new Character("Cortana",
                    "UNSC Artificial intelligence, is a smart artificial intelligence " +
                            "construct. She was one of the most important figures in the Human-Covenant war," +
                            " and was also John-117's partner in various combat missions as well as serving " +
                            "as the A.I. for the Halcyon-class light cruiser - UNSC Pillar of Autumn, Orbital" +
                            " Defense Platform - Cairo Station and Charon-class light frigate - " +
                            "UNSC Forward Unto Dawn.In addition, she held vital data pertaining to the Halos," +
                            " including the Activation Index from Installation 04. ", R.drawable.cortana),
            new Character("Noble Six",
                    "SPARTAN-B312, better known as Noble Six, was a SPARTAN-III commando of the " +
                            "UNSC Naval Special Warfare Command, attached to Special Warfare Group Three." +
                            " B312 served during the Fall of Reach as a member of Noble Team.", R.drawable.noblesix),
            new Character("Captain Keyes",
                    "Captain Keyes was a legendary naval officer and one of the most brilliant " +
                            " tacticians in the UNSC Navy. He commanded great respect " +
                            "as a highly skilled strategist and inspirational leader to " +
                            "those under his command. His many decorations, thirty-five years" +
                            " of combat experience against the Covenant, and the ability to " +
                            "keep a secret made him an almost natural choice to command the " +
                            "UNSC Pillar of Autumn and its most secret cargo. He could often" +
                            " be seen chewing the tip of his grandfather's pipe.",  R.drawable.captainkeyes),
            new Character("The Elite",
                    "The Elite/Sangheili are a saurian species of strong, proud, and intelligent warriors, as well as " +
                            "skilled combat tacticians. The Sangheili are named after their home planet," +
                            " Sanghelios. Due to their skill in combat, the Sangheili have formed the military " +
                            "backbone of the Covenant for almost the entirety of its existence. They had a" +
                            " very strong rivalry with the Jiralhanae, which finally boiled over into open" +
                            " hatred during the Great Schism, and the conclusion of " +
                            "the Human-Covenant war. ", R.drawable.eliteblue),
            new Character("Grunt",
                    "The Grunt/Unggoy is a species of squat bipedal vertebrates in the unified races " +
                            "of the Covenant Empire. They are the lowest-ranking species in the hierarchy," +
                            " and are frequently mistreated by almost every higher-ranking race. Unggoy" +
                            " are primarily used as laborers, slaves, or in combat situations, as cannon fodder." +
                            " They are one of the later races to be introduced into the Covenant, and were either" +
                            " the second or third Covenant species to be encountered by humans. They are" +
                            " referred to as Grunts by humans, as they are considered weak in comparison" +
                            " to their superiors, because they perform the majority of the physical labor" +
                            " required by the Covenant and they lack the knowledge of combat compared to" +
                            " other Covenant species. ", R.drawable.halogrunt),
            new Character("Hunter",
                    "Mgalekgolo, more commonly known as Hunters, are a unique gestalt of smaller creatures " +
                            "known as Lekgolo, which are orange, worm-like creatures. Lekgolo were known" +
                            " to group together as Mgalekgolo for protection during combat, due to the form's" +
                            " increased strength at the cost of maneuverability. When grouping together, " +
                            "the intelligence of the Mgalekgolo colony is increased with every additional " +
                            "Lekgolo. ", R.drawable.hunter),
            new Character("The Flood",
                    "The Flood (meaning the dead reincarnated) or the Parasite," +
                            " as they are known to the Covenant, are a species of highly virulent parasitic" +
                            " organisms that can reproduce and grow by consuming sentient life forms of " +
                            "sufficient biomass and cognitive capability. The Flood was responsible for" +
                            " consuming most of the sentient life in the galaxy, notably the Forerunners," +
                            " during the 300-year-long Forerunner-Flood war. The Flood presents the most" +
                            " variable faction in the trilogy, as it can infect and mutate Humans and" +
                            " Covenant species, such as Sangheili, and Jiralhanae, into Combat Forms." +
                            " They are widely considered to be the greatest threat to the whole existence " +
                            "of life, or, more accurately, biodiversity, in the Milky Way galaxy. ", R.drawable.theflood)
    };
    //Each Character has a name and description
    private Character(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}