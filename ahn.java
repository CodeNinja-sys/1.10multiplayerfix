/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import net.minecraft.c.a;

public class ahn
extends mn {
    @Override
    public String a() {
        return "me";
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public String a(ala ala2) {
        return "commands.me.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new ben("commands.me.usage", new Object[0]);
        }
        cbg cbg2 = ahn.b(ala2, arrstring, 0, !(ala2 instanceof bdl));
        ((cmt)((Object)a2.al())).a(new du("chat.type.emote", ala2.v(), cbg2));
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        return ahn.a(arrstring, a2.J());
    }
}

