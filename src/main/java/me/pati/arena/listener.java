package me.pati.arena;

import org.bukkit.entity.Creature;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import me.pati.arena.spawning;

import java.util.List;

public class listener {
    static public class ArenaListener implements Listener {
        @EventHandler
        public void onEntityDeath(EntityDeathEvent event) {
            if (spawning.entities.contains(event.getEntity())) {
                int idx = 0;
                Creature entity = (Creature) event.getEntity();
                while (idx < spawning.entities.size())
                {
                    if(spawning.entities.get(idx) == entity)
                    {
                        spawning.entities.remove(idx);
                    }
                    else
                    {
                        idx++;
                    }
                }
                // DEBUG
                //System.out.println("Entity Death handler called");
            }
        }
    }
}