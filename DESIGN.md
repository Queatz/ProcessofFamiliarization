# PRD: Process of Familiarization

## 1. Overview

A single-purpose web app where a user inputs **one phrase in any language** and receives a structured deep-familiarization session. The session follows a fixed 4-block loop designed to make the phrase unforgettable through layered repetition.

---

## 2. Problem

At C1–C2, learners encounter slang, idioms, and collocations that appear too sparsely in daily life to stick. Existing tools offer definitions or flashcards, but not the contextual density and active production loops needed to truly own a phrase.

---

## 3. Target User

Advanced language learners (C1–C2) who want to internalize colloquial, idiomatic, or structurally tricky phrases to the point of automatic recall.

---

## 4. Language Handling

- User types a phrase in any language.
- App auto-detects the language. User may override via dropdown.
- User may enter the phrase in English (or any language) and select the target language, receiving the translated equivalent as the study target.
- All tokenization, audio, and story generation respect the target language's rules (word boundaries, compounds, agglutination, tonal marks, script direction, etc.).

---

## 5. Facts Database

A personal, user-managed collection of short factual statements about their life. Used to personalize Block 3 prompts.

**Examples:**
- "I live in Vietnam."
- "I have a neighbor with kids."
- "I work as an Android developer."
- "I play the flute."

**Management screen:**
- Add new facts (free-text input).
- View all saved facts in a simple list.
- Dismiss (delete) individual facts.
- No categories, no tags, no ordering. Just a flat list.

**Usage:** Block 3 pulls 2–4 random facts from this list to generate personalized writing prompts. If the list is empty, prompts default to generic.

---

## 6. Core User Flow

1. User lands on a single input field + optional language selector.
2. User types a phrase.
3. App detects or receives the target language.
4. App generates and displays the 4-block session.
5. User works through at their own pace. No timers. No countdowns.
6. Session ends. Phrase saved with total time studied.

---

## 7. Session Structure (The 4 Blocks)

### Block 1 — Dissect

Structured breakdown card:

| Field | Content |
|-------|---------|
| Tokenized form | Phrase split into language-specific tokens. Each token displayed individually. |
| Literal meaning | Token-by-token gloss |
| Register | Formal / casual / slang / vulgar / neutral |
| Core meaning | One-sentence natural definition |
| Near-synonyms | 3–5 alternatives with strength comparison |
| Grammar slot | Part of speech, sentence position, agreement rules |
| Usage note | Who says it, to whom, where. Constraints. |

Every token is clickable to reveal individual meaning, role, and pronunciation. Supports phrases of any length.

---

### Block 2 — Absorb

Display **4–6 short scenes** (2–3 sentences each). Each scene:

- Sets a concrete, relatable context.
- Builds naturally toward the target phrase.
- Covers different contexts (social, creative, work, everyday).

**Phrase placement:**
- Short phrases: appear at the end of the scene in dialogue or narration.
- Long phrases or multi-sentence phrases: spread naturally across the scene. Not forced to the end.

**Per scene:**

- **Play audio button**: Reads the scene aloud. Each tokenized word highlights in sync during playback.
- **Clickable tokens**: Every word is tokenized and clickable. Clicking opens a mini-dissection (meaning, role, pronunciation) inline.
- **Re-read mode**: Toggle hides the target phrase. User says it aloud before revealing.

---

### Block 3 — Produce

Display **4 writing prompts**. Each prompt:

- Pulls 1–2 facts from the user's Facts Database to create a personalized scenario.
- Asks the user to write a 2–3 sentence micro-scene in the target language.
- Requires the target phrase to appear naturally.
- Text input area provided.

If Facts Database is empty, prompts are generic.

**AI validation per submission:**

- ✅ — perfectly natural.
- ❌ — brief, plain-language correction. No score. No grade.

---

### Block 4 — Loop & Lock

Three sequential micro-exercises:

1. **Recall**: Blank screen. User retypes the stories from memory. Reveal originals to compare.

2. **Vary**: "Use the phrase with 5 different subjects, tenses, or contexts." AI confirms ✅ or ❌ per attempt.

3. **Strip**: "Express the same idea WITHOUT the target phrase." User writes 3 paraphrases. Confirms understanding of meaning, not just pattern. Applies universally to any phrase type.

---

## 8. Time Tracking

- No visible timers, countdowns, or time pressure anywhere.
- App silently tracks total time per phrase (across one or multiple visits).
- Displayed on the phrase's saved card (e.g., "Chất lừ — 47 min").

---

## 9. Persistence & History

- Each session saves: phrase, language, date, time studied.
- Revisiting a phrase regenerates fresh stories.
- Review queue surfaces phrases at 1-day, 3-day, 7-day intervals. No external reminders.

---

## 10. Non-Goals (v1)

- No multi-phrase sessions.
- No social features, sharing, leaderboards.
- No pronunciation scoring or speech recognition.
- No gamification, streaks, XP.
- No mobile app (web only, responsive).
- No visible timers or time pressure.
- No external reminders (email, push).

---

## 11. Success Metric

User can recall and naturally produce the phrase in a novel context 7 days after the session without re-studying.
