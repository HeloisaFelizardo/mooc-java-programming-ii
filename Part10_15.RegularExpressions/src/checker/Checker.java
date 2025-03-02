package checker;

public class Checker {

    // Método que verifica se a string é uma abreviação de um dia da semana
    public boolean isDayOfWeek(String string) {
        // Expressão regular que verifica se a string é uma abreviação válida para os dias da semana
        String regex = "(mon|tue|wed|thu|fri|sat|sun)";
        /*
         * Explicação da regex:
         * (mon|tue|wed|thu|fri|sat|sun) → A string pode ser uma das seguintes opções:
         * - "mon" para Monday (segunda-feira)
         * - "tue" para Tuesday (terça-feira)
         * - "wed" para Wednesday (quarta-feira)
         * - "thu" para Thursday (quinta-feira)
         * - "fri" para Friday (sexta-feira)
         * - "sat" para Saturday (sábado)
         * - "sun" para Sunday (domingo)
         * A "|" é o operador "ou", permitindo que qualquer um desses valores seja aceito.
         */
        // Retorna true se a string corresponder à expressão regular
        return string.matches(regex);
    }

    // Método que verifica se todos os caracteres na string são vogais
    public boolean allVowels(String string) {
        // Expressão regular que permite apenas as vogais 'a', 'e', 'i', 'o', 'u' em qualquer ordem e quantidade
        String regex = "[aeiou]+"; 
        /*
         * Explicação da regex:
         * [aeiou] → O conjunto de caracteres que pode aparecer na string são as vogais 'a', 'e', 'i', 'o', 'u'.
         * O "+" após o conjunto significa que a string pode ter uma ou mais ocorrências dessas vogais.
         * Ou seja, a string só será considerada válida se contiver apenas essas vogais e pelo menos uma delas.
         */
        // Retorna true se a string corresponder à expressão regular (somente vogais)
        return string.matches(regex);
    }

    // Método que verifica se a string corresponde ao formato de hora (hh:mm:ss)
    public boolean timeOfDay(String string) {
        // Expressão regular para verificar o formato de hora: hh:mm:ss
        String regex = "(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
        /*
         * Explicação da regex:
         * (0[0-9]|1[0-9]|2[0-3]) → Representa horas (00-23):
         *   0[0-9] → de 00 a 09
         *   1[0-9] → de 10 a 19
         *   2[0-3] → de 20 a 23
         * 
         * [0-5][0-9] → Representa minutos (00-59)
         * [0-5][0-9] → Representa segundos (00-59)
         * 
         * Os ":" são literais e devem ser escritos normalmente.
         */
        // Retorna true se a string corresponder ao formato de hora válido
        return string.matches(regex);
    }
}
