/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.a.c.a.ae;

final class r
implements ae {
    Pattern a;
    final /* synthetic */ String b;

    r(String string) {
        this.b = string;
        this.a = Pattern.compile(this.b);
    }

    @Override
    public boolean a(CharSequence charSequence) {
        Matcher matcher = this.a.matcher(charSequence);
        return matcher.find();
    }
}

