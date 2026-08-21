package pt.saipar.client.api.wrapper.world;

import pt.saipar.client.api.utils.location.Location;
import pt.saipar.client.api.wrapper.block.BlockWrapper;
import pt.saipar.client.api.wrapper.entity.EntityWrapper;
import pt.saipar.client.api.wrapper.entity.impl.PlayerWrapper;
import pt.saipar.client.api.wrapper.world.chunk.ChunkWrapper;

import java.util.Collection;

public interface WorldWrapper {

    /**
     * Gets the loaded {@link EntityWrapper}s in the {@link WorldWrapper}
     *
     * @return a {@link Collection} with the loaded {@link EntityWrapper}s
     */
    Collection<EntityWrapper> getEntities();

    /**
     * Gets the loaded {@link PlayerWrapper}s in the {@link WorldWrapper}
     *
     * @return a {@link Collection} with the loaded {@link PlayerWrapper}s
     */
    Collection<PlayerWrapper> getPlayers();

    /**
     * Gets a {@link BlockWrapper} from its location
     *
     * @param location the {@link Location}
     * @return the {@link BlockWrapper}
     */
    BlockWrapper getBlock(final Location location);

    /**
     * Finds a {@link ChunkWrapper} from its coordinates
     *
     * @param x the x-coordinate
     * @param z the y-coordinate
     * @return the {@link ChunkWrapper}
     */
    ChunkWrapper getChunk(final int x, final int z);

    /**
     * Checks if a ray between two {@link Location}s is clear of blocks
     *
     * @param start the start {@link Location}
     * @param end the end {@link Location}
     * @return whether the ray is clear
     */
    boolean rayTrace(final Location start, final Location end);

}
