# ezscript

An Easy Scripting Language!

This compiler is written in C++ but hopefully it will get to a point where it can be self-hosted.

## Building

Requires `nasm` and `ld` on a 64 bit Linux operating system.
On Windows you may use WSL (Windows Subystem for Linux).
MacOS is not supported (for now ...) a VM (Virtual Machine) can be used instead.

Or you may try this inside a GitHub Codespace!

CMake and GCC are recommended for building.

```bash
git clone https://github.com/ezscript-lang/ezscript
cd ezscript
mkdir build
cmake -S . -B build
cmake --build build
```

Executable will be `ezscript` in the `build/` directory.

## Credits

[Hydrogen-cpp](https://github.com/orosmatthew/hydrogen-cpp/)