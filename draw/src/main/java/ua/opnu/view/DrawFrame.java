package ua.opnu.view;

import ua.opnu.model.DrawShape;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * Головне вікно програми. Фрейм (клас JFrame) є контейнером верхнього рівня
 */
public class DrawFrame extends JFrame {

    // Область для малювання фігур
    private PaintSurface surface;

    // У конструкторі створюємо GUI
    public DrawFrame(String title) {

        // Зверніть увагу, що ми викликаємо
        // Конструктор базового класу. Усередині нього
        // виконується вся робота з промальовування вікна
        // Нам залишається лише використовувати код суперкласу
        super(title);

        // Кажемо фрейму, що при закритті вікна програма завершує роботу
        // (якщо це не вказати, то програма "висітиме" у процесах
        // після того, як ви закриєте вікно додатку
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Встановлюємо менеджер розмітки
        // (він відповідає за те - як будуть розташовуватися
        // елементи всередині фрейму)
        this.setLayout(new BorderLayout());

        // Додаємо верхню панель із трьома кнопками
        this.add(setButtonPanel(), BorderLayout.NORTH);

        // Створюємо об'єкт області малювання
        surface = new PaintSurface();

        // Додаємо область для малювання фігур у фрейм
        this.add(surface, BorderLayout.CENTER);

        // Цей метод змінює розмір кадру так
        // щоб було видно всі елементи всередині нього
        this.pack();

        // "Показує" фрейм на екрані (встановлюємо видимість фрейму)
        this.setVisible(true);
    }

    /*
     * Даний метод створює та налаштовує
     * верхню панель із кнопками.
     */
    private JPanel setButtonPanel() {

        // Створюємо панель для кнопок
        JPanel buttonPanel = new JPanel(true);

        // Повідомляємо панелі, що елементи всередині нього
        // повинні йти один за одним зліва направо з вирівнюванням по центру
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        // Колір фону панелі
        buttonPanel.setBackground(Color.CYAN);
        // Границя панелі (чорна окантовка навколо панелі)
        buttonPanel.setBorder(new LineBorder(Color.BLACK, 2));

        // *** Додаємо кнопки на панель ***

        // 1. Кнопка для прямокутника
        BigTextButton rect = new BigTextButton("Rectangle");

        rect.addActionListener(e -> {
            surface.setShapeType(DrawShape.SHAPE_RECTANGLE);
        });
        buttonPanel.add(rect);

        // 2. Кнопка для закругленого прямокутника
        BigTextButton rounded_rect = new BigTextButton("Rounded rect.");
        rounded_rect.addActionListener(e -> {
            surface.setShapeType(DrawShape.SHAPE_ROUNDED_RECT);
        });
        buttonPanel.add(rounded_rect);

        BigTextButton ellipse = new BigTextButton("Ellipse");
        ellipse.addActionListener(e -> {
            surface.setShapeType(DrawShape.SHAPE_ELLIPSE);
        });
        buttonPanel.add(ellipse);

        // TODO: додати кнопку для еліпса за аналогією з іншими кнопками
        // TODO: для додаткових балів додати кнопку "Clear" для очищення всіх фігур

        BigTextButton clear = new BigTextButton("Clear");
        clear.addActionListener(e -> {
            surface.clear();
        });
        buttonPanel.add(clear);

        return buttonPanel;
    }
}