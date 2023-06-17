/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.a.b.dg;
import com.a.a.d.mq;
import com.a.a.d.sz;
import java.io.IOException;
import java.io.InputStream;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.minecraft.client.f.an;
import net.minecraft.client.f.s;
import net.minecraft.u.bp;
import org.apache.commons.b.b;
import org.apache.commons.b.t;

public class n {
    private static final dg b = dg.a('=').b(2);
    private static final Pattern c = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    Map a = sz.c();
    private boolean d;

    public synchronized void a(s s2, List list) {
        this.a.clear();
        for (String string : list) {
            String string2 = String.format("lang/%s.lang", string);
            for (String string3 : s2.a()) {
                try {
                    this.a(s2.b(new bp(string3, string2)));
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
        }
        this.b();
    }

    public boolean a() {
        return this.d;
    }

    private void b() {
        this.d = false;
        int n2 = 0;
        int n3 = 0;
        for (String string : this.a.values()) {
            int n4 = string.length();
            n3 += n4;
            for (int i2 = 0; i2 < n4; ++i2) {
                if (string.charAt(i2) < '\u0100') continue;
                ++n2;
            }
        }
        float f2 = (float)n2 / (float)n3;
        this.d = (double)f2 > 0.1;
    }

    private void a(List list) {
        for (an an2 : list) {
            InputStream inputStream = an2.b();
            try {
                this.a(inputStream);
            }
            finally {
                t.a(inputStream);
            }
        }
    }

    private void a(InputStream inputStream) {
        for (String string : t.c(inputStream, org.apache.commons.b.b.f)) {
            String[] arrstring;
            if (string.isEmpty() || string.charAt(0) == '#' || (arrstring = (String[])mq.a(b.a(string), String.class)) == null || arrstring.length != 2) continue;
            String string2 = arrstring[0];
            String string3 = c.matcher(arrstring[1]).replaceAll("%$1s");
            this.a.put(string2, string3);
        }
    }

    private String b(String string) {
        String string2 = (String)this.a.get(string);
        return string2 == null ? string : string2;
    }

    public String a(String string, Object[] arrobject) {
        String string2 = this.b(string);
        try {
            return String.format(string2, arrobject);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }

    public boolean a(String string) {
        return this.a.containsKey(string);
    }
}

