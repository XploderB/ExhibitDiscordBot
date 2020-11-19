package ExhibitBot.Origin.Commands;

import ExhibitBot.Origin.Other.Logging;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.exceptions.PermissionException;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static ExhibitBot.Origin.Other.Global_Variables.COMMAND_PREFIX;

/**
 * Created by josep on 14/06/2017.
 */
public class TotalMembers extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent e){
        String message = e.getMessage().getContentRaw();
        if (message.equalsIgnoreCase(COMMAND_PREFIX + "membercount") && !(e.getAuthor().isBot())) {

            if (e.isFromType(ChannelType.TEXT)) {
                e.getTextChannel().sendMessage( e.getAuthor().getAsMention()+  " There are " + e.getGuild().getMembers().size() + " members on the discord server!").queue();
            } else {
                e.getTextChannel().sendMessage("This command will only work within a discord server!");
            }
            try {Logging.DataLog(e.getGuild().getName(), e.getAuthor().getName(), message, true, e.getGuild());} catch (PermissionException er){}
        }
    }
}
