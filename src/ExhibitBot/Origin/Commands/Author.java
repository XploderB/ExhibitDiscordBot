package ExhibitBot.Origin.Commands;

import ExhibitBot.Origin.Other.Logging;
import com.sun.xml.internal.ws.api.message.Message;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import static ExhibitBot.Origin.Other.Constants.SERVER_IP;

/**
 * Created by josep on 29/07/2017.
 */
public class Author extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e){
        String message = e.getMessage().getContent();

        if (message.equalsIgnoreCase("!author") && !(e.getAuthor().isBot())) {
            e.getTextChannel().sendMessage("```" +
                    "Developed by Origin#9142" +
                    "\nSource Code - https://github.com/Origin658/ExhibitDiscordBot" +
                    "```").queue();


            Logging.DataLog(e.getGuild().getName(), e.getAuthor().getName(), message, true, e.getGuild());
        }

    }
}
