package com.weather_report.help.api;

import com.weather_report.data.Constants;

import java.util.LinkedList;

/**
 * Created by mvasic on 3/31/16.
 */
public class HelpResponse {

    private LinkedList<HelpCommand> usage;

    public LinkedList<HelpCommand> getUsage() {
        return usage;
    }

    public void setUsage(LinkedList<HelpCommand> usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        StringBuilder commands = new StringBuilder();
        for (HelpCommand command : usage) {
            commands.append(command);
        }
        return String.format("%s %s Help:\nCommands:\n%s", Constants.APP_NAME, Constants.VERSION, commands);
    }

}
