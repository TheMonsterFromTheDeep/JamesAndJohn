# JamesAndJohn

This is a very simple Java program, that, when run, will generate sentences such as [this one](https://en.wikipedia.org/wiki/James_while_John_had_had_had_had_had_had_had_had_had_had_had_a_better_effect_on_the_teacher)
using a recursive algorithm. The sentences that are generated are definitely grammatically correct.

It is questionable about whether they are semantically correct, but they should be by a simple argument:
The first iteration will create the sentence in the Wikipedia article, which is unarguably semantically correct.
The second iteration is semantically correct in a context where two people created sentences similar to one in the Wikipedia article.
The third iteration is semantically correct in a context where two people created sentences similar to the second iteration.
-> Ad infinitum

The text file in /example, titled fourteeniterations, is the output of the program when run. It does a fourteen-iteration deep recursive application of the algorithm,
as that was the largest that the computer used could handle. These fourteen iterations generate a 94 megabyte sentence that is gramatically and semantically correct.

To change the iteration number, just set the variable "i" in the main method to a different number.
