package de.baba43.textcomponents.types;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;

@SuppressWarnings("unused")
public enum ChatFormat {

    BOLD(ChatColor.BOLD),
    ITALIC(ChatColor.ITALIC),
    UNDERLINE(ChatColor.UNDERLINE),
    STRIKETHROUGH(ChatColor.STRIKETHROUGH),
    MAGIC(ChatColor.MAGIC),
    RESET(ChatColor.RESET);

    private final ChatColor code;

    ChatFormat(ChatColor code) {
        this.code = code;
    }

    public ChatColor getCode() {
        return code;
    }

    public void apply(TextComponent text) {
        switch (code) {
            case BOLD:
                text.setBold(true);
                break;
            case ITALIC:
                text.setItalic(true);
                break;
            case UNDERLINE:
                text.setUnderlined(true);
                break;
            case STRIKETHROUGH:
                text.setStrikethrough(true);
                break;
            case MAGIC:
                text.setObfuscated(true);
                break;
            case RESET:
                text.setBold(false);
                text.setItalic(false);
                text.setUnderlined(false);
                text.setStrikethrough(false);
                text.setObfuscated(false);
                break;
            default:
        }
    }
}
