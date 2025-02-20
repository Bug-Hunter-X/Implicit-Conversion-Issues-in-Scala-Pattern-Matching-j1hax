# Scala Implicit Conversion Bug

This repository demonstrates a subtle bug related to implicit conversions in Scala pattern matching.  The code appears to handle different types correctly, but a runtime error occurs due to an unexpected type mismatch.

The `MyClass` uses pattern matching to handle different types within its `myMethod`. However, using `asInstanceOf` for implicit type conversion introduces fragility, causing failure when dealing with types not explicitly handled (Boolean in this case).

The solution showcases how to refactor the code for better type safety and robustness, avoiding reliance on implicit conversions in pattern matching.