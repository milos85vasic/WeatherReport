package com.weather_report.help.api;

import java.util.LinkedList;

/**
 * Created by mvasic on 4/5/16.
 */
public class HelpCommand {

    private String name;
    private String description;
    private LinkedList<HelpParameter> parameters;

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

    public LinkedList<HelpParameter> getParameters() {
        return parameters;
    }

    public void setParameters(LinkedList<HelpParameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        StringBuilder params = null;
        if (parameters != null) {
            params = new StringBuilder();
            for (HelpParameter parameter : parameters) {
                params.append(parameter);
            }
        }
        return String.format(
                "\tCommand: %s\n\tDescription: %s\n%s\n",
                name,
                description,
                (params != null ? String.format("\tParameters:\n%s", params) : "")
        );
    }
}
