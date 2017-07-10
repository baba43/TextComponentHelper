package de.baba43.textcomponents;

import de.baba43.textcomponents.interfaces.ClickTextBuilder;
import de.baba43.textcomponents.interfaces.HoverTextBuilder;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;

@SuppressWarnings("unused")
public class TextBuilder extends ComponentBuilder
    implements HoverTextBuilder<TextBuilder>, ClickTextBuilder<TextBuilder> {

    @SuppressWarnings("WeakerAccess")
    public TextBuilder(String text) {
        super(text);
    }

    @Override
    public TextBuilder click(ClickEvent event) {
        event(event);
        return this;
    }

    @Override
    public TextBuilder hover(HoverEvent event) {
        event(event);
        return this;
    }

    public static TextBuilder createText(String text) {
        return new TextBuilder(text);
    }
}
