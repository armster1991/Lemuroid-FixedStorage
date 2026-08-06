# Lemuroid Fixed Storage

> A community fork of Lemuroid focused on making local storage usable again on Android TV and Google TV devices.

---

## Português

### Sobre esta fork

O **Lemuroid Fixed Storage** é uma fork do [Lemuroid](https://github.com/Swordfish90/Lemuroid), um projeto de emulação open source para Android baseado em Libretro.

Esta versão foi criada para resolver um problema específico em dispositivos Android TV e Google TV mais recentes:

- o Google removeu ou tornou indisponível o seletor de arquivos e pastas em várias TV boxes;
- o Android 11+ restringiu o acesso dos aplicativos à pasta `Android/data`;
- como resultado, muitos usuários não conseguiam selecionar uma pasta de ROMs nem acessar facilmente os arquivos usados pelo aplicativo.

Depois de tentar usar um frontend de emulação em uma TV box e encontrar o mesmo problema repetidamente — além de ver muitas outras pessoas reclamando da mesma limitação — surgiu a pergunta:

> **Por que não corrigir isso?**

Esta fork substitui o seletor de pastas por uma estrutura fixa e pública no armazenamento interno.

### Como usar

Na primeira execução, o aplicativo cria a pasta:

```text
/storage/emulated/0/Lemuroid/
```

Crie manualmente a pasta:

```text
/storage/emulated/0/Lemuroid/roms/
```

Depois, coloque suas ROMs dentro dela.

Estrutura esperada:

```text
Lemuroid/
├── roms/
├── saves/
├── savestates/
├── state-previews/
└── system/
```

As pastas de saves e save states podem ser criadas automaticamente quando forem usadas pela primeira vez.

Depois de copiar as ROMs:

1. Abra o Lemuroid Fixed Storage.
2. Conceda a permissão de acesso a todos os arquivos, quando solicitado.
3. Use a opção de atualizar ou reindexar a biblioteca.
4. Os jogos encontrados dentro de `Lemuroid/roms` serão adicionados à biblioteca.

### Avisos importantes

- Esta fork usa uma pasta fixa e não oferece seleção livre de diretório.
- O caminho padrão das ROMs é sempre:

```text
/storage/emulated/0/Lemuroid/roms/
```

- Esta versão é voltada principalmente para Android TV e Google TV.
- ROMs, BIOS e outros arquivos protegidos por direitos autorais não são incluídos.
- Você é responsável por usar apenas arquivos que tenha o direito legal de utilizar.

### Sobre o Lemuroid

Lemuroid é um projeto de emulação open source para Android baseado em Libretro. Seu principal objetivo é oferecer facilidade de uso, boa integração com Android e uma ótima experiência de usuário.

Ele nasceu a partir do projeto Retrograde e depois se tornou um projeto independente, integrando o LibretroDroid.

### Sistemas suportados

- Atari 2600 — Stella
- Atari 7800 — ProSystem
- Atari Lynx — Handy
- Nintendo Entertainment System — FCEUmm
- Super Nintendo — Snes9x
- Game Boy — Gambatte
- Game Boy Color — Gambatte
- Game Boy Advance — mGBA
- Sega Genesis / Mega Drive — Genesis Plus GX
- Sega CD / Mega CD — Genesis Plus GX
- Sega Master System — Genesis Plus GX
- Sega Game Gear — Genesis Plus GX
- Nintendo 64 — Mupen64Plus
- PlayStation — PCSX-ReARMed
- PlayStation Portable — PPSSPP
- FinalBurn Neo / Arcade — FBNeo
- Nintendo DS — DeSmuME / melonDS
- NEC PC Engine — Beetle PCE Fast
- Neo Geo Pocket — Mednafen NGP
- Neo Geo Pocket Color — Mednafen NGP
- WonderSwan — Beetle Cygne
- WonderSwan Color — Beetle Cygne
- Nintendo 3DS — Citra

### Recursos

- Suporte a Android TV
- Salvamento e restauração automática de estados
- Escaneamento e indexação de ROMs
- Controles de toque otimizados
- Save e load rápidos
- Suporte a ROMs compactadas em ZIP
- Simulação de tela LCD e CRT
- Suporte a gamepads
- Multiplayer local
- Entrada por inclinação
- Controles de toque personalizáveis
- Sincronização de saves na nuvem
- Modo HD

### Créditos

Todo o mérito pelo Lemuroid original pertence aos seus desenvolvedores e contribuidores.

Projeto original:

- [Swordfish90/Lemuroid](https://github.com/Swordfish90/Lemuroid)

Esta fork altera principalmente o comportamento de armazenamento para contornar limitações presentes em dispositivos Android TV e Google TV modernos.

### Traduções

Você pode ajudar a traduzir o Lemuroid pelo Crowdin:

- [Lemuroid no Crowdin](https://crowdin.com/project/lemuroid)

---

## English

### About this fork

**Lemuroid Fixed Storage** is a fork of [Lemuroid](https://github.com/Swordfish90/Lemuroid), an open-source Android emulation project based on Libretro.

This version was created to solve a specific problem affecting newer Android TV and Google TV devices:

- Google removed or disabled the system file and folder picker on several TV boxes;
- Android 11+ restricted application access to `Android/data`;
- as a result, many users could no longer select a ROM directory or easily access the files used by the application.

After repeatedly trying to run an emulation frontend on a TV box, encountering the same limitation, and seeing many other users report the exact same problem, one question came to mind:

> **Why not fix it?**

This fork replaces folder selection with a fixed, publicly accessible directory in internal storage.

### How to use

On first launch, the application creates:

```text
/storage/emulated/0/Lemuroid/
```

Manually create:

```text
/storage/emulated/0/Lemuroid/roms/
```

Then place your ROM files inside it.

Expected directory structure:

```text
Lemuroid/
├── roms/
├── saves/
├── savestates/
├── state-previews/
└── system/
```

The save and save-state directories may be created automatically when they are first used.

After copying your ROM files:

1. Open Lemuroid Fixed Storage.
2. Grant all-files access when requested.
3. Use the rescan or library refresh option.
4. Games found inside `Lemuroid/roms` will be added to the library.

### Important notes

- This fork uses a fixed directory and does not provide free folder selection.
- The ROM directory is always:

```text
/storage/emulated/0/Lemuroid/roms/
```

- This version is mainly intended for Android TV and Google TV devices.
- ROMs, BIOS files, and other copyrighted content are not included.
- You are responsible for using only files you are legally allowed to use.

### About Lemuroid

Lemuroid is an open-source emulation project for Android based on Libretro. Its main goal is ease of use, good Android integration, and a great user experience.

It originated from the Retrograde project and later became a standalone project integrating LibretroDroid.

### Supported systems

- Atari 2600 — Stella
- Atari 7800 — ProSystem
- Atari Lynx — Handy
- Nintendo Entertainment System — FCEUmm
- Super Nintendo — Snes9x
- Game Boy — Gambatte
- Game Boy Color — Gambatte
- Game Boy Advance — mGBA
- Sega Genesis / Mega Drive — Genesis Plus GX
- Sega CD / Mega CD — Genesis Plus GX
- Sega Master System — Genesis Plus GX
- Sega Game Gear — Genesis Plus GX
- Nintendo 64 — Mupen64Plus
- PlayStation — PCSX-ReARMed
- PlayStation Portable — PPSSPP
- FinalBurn Neo / Arcade — FBNeo
- Nintendo DS — DeSmuME / melonDS
- NEC PC Engine — Beetle PCE Fast
- Neo Geo Pocket — Mednafen NGP
- Neo Geo Pocket Color — Mednafen NGP
- WonderSwan — Beetle Cygne
- WonderSwan Color — Beetle Cygne
- Nintendo 3DS — Citra

### Features

- Android TV support
- Automatic save-state creation and restoration
- ROM scanning and indexing
- Optimized touch controls
- Quick save and load
- ZIP-compressed ROM support
- LCD and CRT display simulation
- Gamepad support
- Local multiplayer
- Tilt input
- Customizable touch controls
- Cloud save synchronization
- HD mode

### Credits

All credit for the original Lemuroid project belongs to its developers and contributors.

Original project:

- [Swordfish90/Lemuroid](https://github.com/Swordfish90/Lemuroid)

This fork primarily changes the storage behavior to work around limitations found on modern Android TV and Google TV devices.

### Translations

You can help translate Lemuroid through Crowdin:

- [Lemuroid on Crowdin](https://crowdin.com/project/lemuroid)
