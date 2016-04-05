package com.weather_report.help.api;

/**
 * Created by mvasic on 4/5/16.
 */
public class HelpCommand {

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Command: %s\nDescription: %s\n\n", name, description);
    }
}
