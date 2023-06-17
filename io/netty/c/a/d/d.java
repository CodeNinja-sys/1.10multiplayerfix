/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.am;
import io.netty.c.a.d.g;
import io.netty.util.c.ad;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public final class d {
    private static final char a = ',';

    public static Set a(String string) {
        int n2;
        ArrayList arrayList = new ArrayList(8);
        ArrayList arrayList2 = new ArrayList(8);
        d.a(string, arrayList, arrayList2);
        if (arrayList.isEmpty()) {
            return Collections.emptySet();
        }
        int n3 = 0;
        if (((String)arrayList.get(0)).equalsIgnoreCase("Version")) {
            try {
                n3 = Integer.parseInt((String)arrayList2.get(0));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            n2 = 1;
        } else {
            n2 = 0;
        }
        if (arrayList.size() <= n2) {
            return Collections.emptySet();
        }
        TreeSet<g> treeSet = new TreeSet<g>();
        while (n2 < arrayList.size()) {
            String string2 = (String)arrayList.get(n2);
            String string3 = (String)arrayList2.get(n2);
            if (string3 == null) {
                string3 = "";
            }
            g g2 = new g(string2, string3);
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            String string4 = null;
            String string5 = null;
            String string6 = null;
            String string7 = null;
            long l2 = Long.MIN_VALUE;
            ArrayList<Integer> arrayList3 = new ArrayList<Integer>(2);
            int n4 = n2 + 1;
            while (n4 < arrayList.size()) {
                string2 = (String)arrayList.get(n4);
                string3 = (String)arrayList2.get(n4);
                if ("Discard".equalsIgnoreCase(string2)) {
                    bl2 = true;
                } else if ("Secure".equalsIgnoreCase(string2)) {
                    bl3 = true;
                } else if ("HTTPOnly".equalsIgnoreCase(string2)) {
                    bl4 = true;
                } else if ("Comment".equalsIgnoreCase(string2)) {
                    string4 = string3;
                } else if ("CommentURL".equalsIgnoreCase(string2)) {
                    string5 = string3;
                } else if ("Domain".equalsIgnoreCase(string2)) {
                    string6 = string3;
                } else if ("Path".equalsIgnoreCase(string2)) {
                    string7 = string3;
                } else if ("Expires".equalsIgnoreCase(string2)) {
                    try {
                        long l3 = am.a().parse(string3).getTime() - System.currentTimeMillis();
                        l2 = l3 / 1000L + (long)(l3 % 1000L != 0L ? 1 : 0);
                    }
                    catch (ParseException parseException) {}
                } else if ("Max-Age".equalsIgnoreCase(string2)) {
                    l2 = Integer.parseInt(string3);
                } else if ("Version".equalsIgnoreCase(string2)) {
                    n3 = Integer.parseInt(string3);
                } else {
                    String[] arrstring;
                    if (!"Port".equalsIgnoreCase(string2)) break;
                    for (String string8 : arrstring = ad.a(string3, ',')) {
                        try {
                            arrayList3.add(Integer.valueOf(string8));
                        }
                        catch (NumberFormatException numberFormatException) {
                            // empty catch block
                        }
                    }
                }
                ++n4;
                ++n2;
            }
            g2.a(n3);
            g2.a(l2);
            g2.c(string7);
            g2.b(string6);
            g2.a(bl3);
            g2.b(bl4);
            if (n3 > 0) {
                g2.d(string4);
            }
            if (n3 > 1) {
                g2.e(string5);
                g2.a(arrayList3);
                g2.c(bl2);
            }
            treeSet.add(g2);
            ++n2;
        }
        return treeSet;
    }

    private static void a(String string, List list, List list2) {
        int n2 = string.length();
        int n3 = 0;
        block10: while (n3 != n2) {
            switch (string.charAt(n3)) {
                case '\t': 
                case '\n': 
                case '\u000b': 
                case '\f': 
                case '\r': 
                case ' ': 
                case ',': 
                case ';': {
                    ++n3;
                    continue block10;
                }
            }
            while (n3 != n2) {
                String string2;
                String string3;
                if (string.charAt(n3) == '$') {
                    ++n3;
                    continue;
                }
                if (n3 == n2) {
                    string3 = null;
                    string2 = null;
                } else {
                    int n4 = n3;
                    block12: while (true) {
                        switch (string.charAt(n3)) {
                            case ';': {
                                string3 = string.substring(n4, n3);
                                string2 = null;
                                break block12;
                            }
                            case '=': {
                                string3 = string.substring(n4, n3);
                                if (++n3 == n2) {
                                    string2 = "";
                                    break block12;
                                }
                                int n5 = n3;
                                char c2 = string.charAt(n3);
                                if (c2 == '\"' || c2 == '\'') {
                                    StringBuilder stringBuilder = new StringBuilder(string.length() - n3);
                                    char c3 = c2;
                                    boolean bl2 = false;
                                    ++n3;
                                    block13: while (true) {
                                        if (n3 == n2) {
                                            string2 = stringBuilder.toString();
                                            break block12;
                                        }
                                        if (bl2) {
                                            bl2 = false;
                                            c2 = string.charAt(n3++);
                                            switch (c2) {
                                                case '\"': 
                                                case '\'': 
                                                case '\\': {
                                                    stringBuilder.setCharAt(stringBuilder.length() - 1, c2);
                                                    continue block13;
                                                }
                                            }
                                            stringBuilder.append(c2);
                                            continue;
                                        }
                                        if ((c2 = string.charAt(n3++)) == c3) {
                                            string2 = stringBuilder.toString();
                                            break block12;
                                        }
                                        stringBuilder.append(c2);
                                        if (c2 != '\\') continue;
                                        bl2 = true;
                                    }
                                }
                                int n6 = string.indexOf(59, n3);
                                if (n6 > 0) {
                                    string2 = string.substring(n5, n6);
                                    n3 = n6;
                                    break block12;
                                }
                                string2 = string.substring(n5);
                                n3 = n2;
                                break block12;
                            }
                            default: {
                                if (++n3 != n2) continue block12;
                                string3 = string.substring(n4);
                                string2 = null;
                                break block12;
                            }
                        }
                        break;
                    }
                }
                list.add(string3);
                list2.add(string2);
                continue block10;
            }
            break block10;
        }
    }

    private d() {
    }
}

