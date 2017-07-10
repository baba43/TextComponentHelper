package de.baba43.textcomponents.interfaces;

import de.baba43.textcomponents.types.ChatFormat;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

@SuppressWarnings("unused")
public interface HoverTextBuilder<T> {

    default T hover(String text) {
        return hover(text, ChatColor.WHITE);
    }

    default T hover(String text, ChatColor color) {
        return hover(text, color, (ChatFormat) null);
    }

    default T hover(String text, ChatFormat... formats) {
        return hover(text, ChatColor.WHITE, formats);
    }

    default T hover(String text, ChatColor color, ChatFormat... formats) {
        TextComponent component = new TextComponent(text);
        component.setColor(color);
        for (ChatFormat format : formats) {
            format.apply(component);
        }
        return hover(component);
    }

    default T hover(TextComponent component) {
        return hover(
            new HoverEvent(HoverEvent.Action.SHOW_TEXT, new TextComponent[]{component})
        );
    }

    T hover(HoverEvent event);
}
