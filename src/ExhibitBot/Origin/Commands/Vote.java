package ExhibitBot.Origin.Commands;

import ExhibitBot.Origin.Other.Logging;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;



/**
 * Created by josep on 10/06/2017.
 */
public class Vote extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e){
        String message = e.getMessage().getContent();

        if (message.equalsIgnoreCase("!vote") && !(e.getAuthor().isBot())) {
            e.getTextChannel().sendMessage("```We appreciate all the votes we can get, it really has a huge impact on the server!" +
                    "\n-----------" +
                    "\nVoting Site 1 - http://minecraft-server-list.com/server/331452/vote/" +
                    "\nVoting Site 2 - http://minecraft-mp.com/server/108491/vote/" +
                    "\nVoting Site 3 - http://minecraftservers.org/server/330550" +
                    "\n-----------" +
                    "\nPlanet Minecraft - http://www.planetminecraft.com/server/exhibit-minecraft/vote" +
                    "\nNote that Planet Minecraft is an Unlinked voting site.```").queue();


            Logging.DataLog(e.getGuild().getName(), e.getAuthor().getName(), message, true, e.getGuild());
        }



    }


}