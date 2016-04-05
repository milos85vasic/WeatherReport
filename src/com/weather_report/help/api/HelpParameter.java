package com.weather_report.help.api;

/**
 * Created by mvasic on 4/5/16.
 */
public class HelpParameter {

    private String name;
    private String description;
    private String arguments;
    private String example;

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

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return String.format(
                "\t\t%s: %s\n%s%s",
                name,
                description,
                (arguments != null ? String.format("\t\t  Arguments: %s\n", arguments) : ""),
                (example != null ? String.format("\t\t  Example: %s\n", example) : "")
        );
    }

}
