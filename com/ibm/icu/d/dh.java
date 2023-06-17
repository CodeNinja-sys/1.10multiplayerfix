/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.ec;
import com.ibm.icu.d.dl;
import com.ibm.icu.d.lf;
import java.util.ArrayList;
import java.util.List;

public class dh {
    private transient ec a = new ec().b(new lf("[a-zA-Z]")).c(new lf("[[[:script=Latn:][:script=Cyrl:]]&[[:L:][:M:]]]")).a(true);
    private List b = new ArrayList();

    public final dh a(String string) {
        return this.a(string, false);
    }

    public dh a(String string, boolean bl2) {
        this.b.clear();
        if (string.length() == 0) {
            return this;
        }
        this.a.a(string);
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        while (true) {
            stringBuffer.setLength(0);
            int n2 = this.a.a(stringBuffer);
            if (n2 == 0) break;
            if (n2 == 1) {
                if (stringBuffer2.length() != 0 && stringBuffer.charAt(0) != stringBuffer2.charAt(0)) {
                    this.a(stringBuffer2, false);
                }
                stringBuffer2.append(stringBuffer);
                continue;
            }
            this.a(stringBuffer2, false);
            this.b.add(stringBuffer.toString());
        }
        this.a(stringBuffer2, false);
        return this;
    }

    private void a(StringBuffer stringBuffer, boolean bl2) {
        if (stringBuffer.length() != 0) {
            this.b.add(new dl(stringBuffer.toString(), bl2));
            stringBuffer.setLength(0);
        }
    }

    public List a() {
        return this.b;
    }

    public String toString() {
        return this.a(0, this.b.size());
    }

    public String a(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = n2; i2 < n3; ++i2) {
            Object e2 = this.b.get(i2);
            if (e2 instanceof String) {
                String string = (String)e2;
                stringBuilder.append(this.a.b(string));
                continue;
            }
            stringBuilder.append(this.b.get(i2).toString());
        }
        return stringBuilder.toString();
    }

    public boolean b() {
        int n2 = 0;
        for (Object e2 : this.b) {
            if (!(e2 instanceof dl)) continue;
            int n3 = ((dl)e2).a();
            n2 |= 1 << n3;
        }
        boolean bl2 = (n2 & 0x3FF) != 0;
        boolean bl3 = (n2 & 0xFC00) != 0;
        return bl2 && bl3;
    }

    public Object b(String string) {
        return this.a.b(string);
    }

    static /* synthetic */ List a(dh dh2) {
        return dh2.b;
    }
}

