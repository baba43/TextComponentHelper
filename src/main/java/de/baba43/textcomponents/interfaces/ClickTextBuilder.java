package de.baba43.textcomponents.interfaces;

import net.md_5.bungee.api.chat.ClickEvent;

@SuppressWarnings("unused")
public interface ClickTextBuilder<T> {

    default T command(String command) {
        return click(new ClickEvent(ClickEvent.Action.RUN_COMMAND, command));
    }

    default T link(String url) {
        return click(new ClickEvent(ClickEvent.Action.OPEN_URL, url));
    }

    default T suggest(String command) {
        return click(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, command));
    }

    T click(ClickEvent event);
}
