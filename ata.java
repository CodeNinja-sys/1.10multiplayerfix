/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.c.a;

public class ata
extends mn {
    public static final Pattern a = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    @Override
    public String a() {
        return "ban-ip";
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
        return "commands.banip.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 1 || arrstring[0].length() <= 1) {
            throw new ben("commands.banip.usage", new Object[0]);
        }
        cbg cbg2 = arrstring.length >= 2 ? ata.a(ala2, arrstring, 1) : null;
        Matcher matcher = a.matcher(arrstring[0]);
        if (matcher.matches()) {
            this.a(a2, ala2, arrstring[0], cbg2 == null ? null : cbg2.i());
        } else {
            czt czt2 = ((cmt)((Object)a2.al())).a(arrstring[0]);
            if (czt2 == null) {
                throw new chs("commands.banip.invalid", new Object[0]);
            }
            this.a(a2, ala2, czt2.bT(), cbg2 == null ? null : cbg2.i());
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return ata.a(arrstring, a2.J());
        }
        return Collections.emptyList();
    }

    protected void a(a a2, ala ala2, String string, String string2) {
        zn zn2 = new zn(string, null, ala2.i_(), null, string2);
        ((cmt)((Object)a2.al())).i().a(zn2);
        List list = ((cmt)((Object)a2.al())).b(string);
        Object[] arrobject = new String[list.size()];
        int n2 = 0;
        for (czt czt2 : list) {
            czt2.a.a("You have been IP banned.");
            arrobject[n2++] = czt2.i_();
        }
        if (list.isEmpty()) {
            ata.a(ala2, (fh)this, "commands.banip.success", string);
        } else {
            ata.a(ala2, (fh)this, "commands.banip.success.players", string, ata.a(arrobject));
        }
    }
}

