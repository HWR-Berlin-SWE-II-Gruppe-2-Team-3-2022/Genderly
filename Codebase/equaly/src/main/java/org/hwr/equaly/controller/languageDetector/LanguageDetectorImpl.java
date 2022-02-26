package org.hwr.equaly.controller.languageDetector;

import com.github.pemistahl.lingua.api.Language;
import com.github.pemistahl.lingua.api.LanguageDetectorBuilder;

import static com.github.pemistahl.lingua.api.Language.*;
import org.springframework.stereotype.Component;

@Component
public class LanguageDetectorImpl implements LanguageDetector {
    private com.github.pemistahl.lingua.api.LanguageDetector detector;

    public LanguageDetectorImpl() {
        this.detector = LanguageDetectorBuilder.fromLanguages(ENGLISH, GERMAN).build();
    }

    @Override
    public Language getLanguage(String text) {
        return detector.detectLanguageOf(text);
    }

}
