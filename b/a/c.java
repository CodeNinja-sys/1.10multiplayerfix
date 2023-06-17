/*
 * Decompiled with CFR 0.150.
 */
package b.a;

import b.a.i;
import b.a.k;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class c {
    private static final int a = 2;
    private final int b;
    private final int c;

    c(int n2, int n3) {
        this.b = n2;
        this.c = n3;
    }

    List a(i i2) {
        List list = this.a(i2.a, this.b);
        List list2 = this.a(i2.b, this.c);
        ArrayList<i> arrayList = new ArrayList<i>();
        for (int i3 = 0; i3 < Math.max(list.size(), list2.size()); ++i3) {
            arrayList.add(new i(b.a.c.a(list, i3), b.a.c.a(list2, i3)));
        }
        return arrayList;
    }

    private static String a(List list, int n2) {
        return n2 >= list.size() ? "" : (String)list.get(n2);
    }

    private List a(String string, int n2) {
        ArrayList arrayList = new ArrayList();
        for (String string2 : string.trim().split(k.c)) {
            arrayList.addAll(this.b(string2, n2));
        }
        return arrayList;
    }

    private List b(String string, int n2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        BreakIterator breakIterator = BreakIterator.getLineInstance(Locale.US);
        breakIterator.setText(string);
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = breakIterator.first();
        int n4 = breakIterator.next();
        while (n4 != -1) {
            stringBuilder = this.a(string, stringBuilder, n3, n4, n2, arrayList);
            n3 = n4;
            n4 = breakIterator.next();
        }
        if (stringBuilder.length() > 0) {
            arrayList.add(stringBuilder.toString());
        }
        return arrayList;
    }

    private StringBuilder a(String string, StringBuilder stringBuilder, int n2, int n3, int n4, List list) {
        StringBuilder stringBuilder2 = stringBuilder;
        String string2 = string.substring(n2, n3);
        if (stringBuilder2.length() + string2.length() > n4) {
            list.add(stringBuilder2.toString().replaceAll("\\s+$", ""));
            stringBuilder2 = new StringBuilder(k.a(' ', 2)).append(string2);
        } else {
            stringBuilder2.append(string2);
        }
        return stringBuilder2;
    }
}

