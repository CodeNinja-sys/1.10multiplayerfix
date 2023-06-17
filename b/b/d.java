/*
 * Decompiled with CFR 0.150.
 */
package b.b;

import b.af;
import b.ag;
import java.util.regex.Pattern;

public class d
implements ag {
    private final Pattern a;

    public d(String string, int n2) {
        this.a = Pattern.compile(string, n2);
    }

    public static ag b(String string) {
        return new d(string, 0);
    }

    public String c(String string) {
        if (!this.a.matcher(string).matches()) {
            throw new af("Value [" + string + "] did not match regex [" + this.a.pattern() + ']');
        }
        return string;
    }

    public Class a() {
        return String.class;
    }

    public String b() {
        return this.a.pattern();
    }

    public /* synthetic */ Object a(String string) {
        return this.c(string);
    }
}

