package pt.saipar.client.api.friend;

import java.util.Collection;

public interface FriendManager {

    void register();

    /**
     * Adds a friend
     *
     * @param name the name
     */
    void add(final String name);

    /**
     * Removes a friend
     *
     * @param name the name
     */
    void remove(final String name);

    /**
     * Whether the name is in the friend list
     *
     * @param name the name
     * @return whether the name is in the friend list
     */
    boolean isFriend(final String name);

    /**
     * Gets all the friends
     *
     * @return a {@link Collection} with all the friends
     */
    Collection<String> getFriends();

}
