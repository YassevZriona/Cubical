package me.yassev.thecube.events;

import me.yassev.thecube.init.ModItems;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GlobalTalkie {
    @SubscribeEvent
    public void playerChat(ServerChatEvent event) {
        EntityPlayerMP s = event.getPlayer();
        Item sOffHand = s.getHeldItemOffhand().getItem();
        Item sMainHand = s.getHeldItemMainhand().getItem();
        if(sMainHand == ModItems.WALKIE_TALKIE || sOffHand == ModItems.WALKIE_TALKIE) {
            event.setCanceled(true);
            PlayerList players = s.mcServer.getPlayerList();
            for (EntityPlayerMP r : players.getPlayers()) {
                Item rOffHand = r.getHeldItemOffhand().getItem();
                Item rMainHand = r.getHeldItemMainhand().getItem();
                if(rMainHand == ModItems.WALKIE_TALKIE) {
                    String sItemName = sMainHand.getItemStackDisplayName(s.getHeldItemMainhand());
                    String rItemName = rMainHand.getItemStackDisplayName(r.getHeldItemMainhand());
                    if(!sItemName.matches("/[0-9999]/ ")) {
                        if (sItemName.equals(rItemName)) {
                            r.sendMessage(new TextComponentString("\u00A71(" + s.getDisplayName() + "\u00A71)" + event.getMessage()));
                        }
                    } else {
                        s.sendMessage(new TextComponentString("\u00A7cThe Walkie Talkie is not bound!\n\u00A73You can bind it by renaming it to a numeric id 0-9999 in an avnil and another walkie talkie bound to same id will recieve the message."));
                    }
                }
                if(rOffHand == ModItems.WALKIE_TALKIE) {
                    String sItemName = sOffHand.getItemStackDisplayName(s.getHeldItemOffhand());
                    String rItemName = rOffHand.getItemStackDisplayName(r.getHeldItemOffhand());
                    if(!sItemName.matches("/[0-9999]/ ")) {
                        if (sItemName.equals(rItemName)) {
                            r.sendMessage(new TextComponentString("\u00A71(" + s.getDisplayName() + "\u00A71)" + event.getMessage()));
                        }
                    } else {
                        s.sendMessage(new TextComponentString("\u00A7cThe Walkie Talkie is not bound!\n\u00A73You can bind it by renaming it to a numeric id 0-9999 in an avnil and another walkie talkie bound to same id will recieve the message."));
                    }
                }
            }
        }
    }
}
