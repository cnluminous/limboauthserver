package cn.jja8.limbo.eventWork.event.player;

import cn.jja8.limbo.Player;

public class PlayerQuitEvent extends PlayerEvent{
    public PlayerQuitEvent(Player player) {
        super(player);
    }
}
