package ExhibitBot.Origin.GuildMembers;


import net.dv8tion.jda.api.events.guild.GuildBanEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static ExhibitBot.Origin.Other.Global_Variables.USER_BANS;

/**
 * Created by josep on 11/10/2017.
 */
public class GuildBan extends ListenerAdapter {

    @Override
    public void onGuildBan(GuildBanEvent e) {
            USER_BANS.add(e.getUser());
    }
}
