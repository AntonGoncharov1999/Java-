# Java
тренировка Java

# 1 Text Modifier 
- Результатом работы метода является возврат строки (текста) с учётом всех изменений.

- Результатом работы программы является вывод в консоль изменённого текста согласно всем условиям:

- 1. Пользователь вводит текст одной строкой и нажимает “enter”.

- 2. В тексте могут присутствовать различные специальные символы, которые надо обрабатывать согласно условиям ниже:

- a. Если в тексте между словами присутствует несколько пробелов подряд, надо оставить только один из них. Для реализации
этого подпункта нельзя пользоваться методами replace() и replaceAll().

- b. Если в тексте присутствует знак минус (-), это значит, что символ слева от этого знака надо поменять местами с символом,
который стоит справа от этого знака. Обратите внимание, что символом может быть не только буква, но и число или любой другой знак/символ,
в том числе символ пробела. После смены символов местами, знак минус (-) надо удалить из строки результата.

- c. Если в тексте присутствует знак плюс (+), вам необходимо заменить его на восклицательный знак (!).  (готово)

- d. В тексте могут присутствовать цифры (от 0 до 9). Вам необходимо посчитать их сумму и удалить из текста. (готов)
Сумму цифр вам нужно добавить в конец результирующей строки через пробел (пробел должен стоять перед суммой цифр).
