public class Main {
    private static void editScript(String[] roles, String[] textLines) {
        StringBuilder script = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            script.append(roles[i] + ":\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i])) {
                    script.append((j + 1) + ") ");
                    script.append(textLines[j].substring(roles[i].length() + 2));
                    script.append("\n");
                }
            }
            script.append("\n");
        }
        System.out.println(script);
    }

    public static void main(String[] args) {
        String[] roles = {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич",
        };
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
        };
        editScript(roles, textLines);
    }
}