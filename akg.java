/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import net.minecraft.c.a;

public class akg
extends mn {
    @Override
    public String a() {
        return "pardon-ip";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public boolean a(a a2, ala ala2) {
        return ((cmt)((Object)a2.al())).i().b() && super.a(a2, ala2);
    }

    @Override
    public String a(ala ala2) {
        return "commands.unbanip.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length != 1 || arrstring[0].length() <= 1) {
            throw new ben("commands.unbanip.usage", new Object[0]);
        }
        Matcher matcher = ata.a.matcher(arrstring[0]);
        if (!matcher.matches()) {
            throw new hw("commands.unbanip.invalid", new Object[0]);
        }
        ((cmt)((Object)a2.al())).i().c(arrstring[0]);
        akg.a(ala2, (fh)this, "commands.unbanip.success", arrstring[0]);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return akg.a(arrstring, ((cmt)((Object)a2.al())).i().a());
        }
        return Collections.emptyList();
    }
}

