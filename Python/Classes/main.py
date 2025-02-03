from examen1.game import Player
from game import Position
from game import Weapon


def main():
    p1 = Position(1, 1)
    print(p1)

    p2 = Position(2, 3)
    print(p2)

    p3 = Position(2, 5)
    print(p3)

    w1 = Weapon("Axe", 12, 14)
    print(w1)

    player1 = Player("Manolo", p1, w1)
    print(player1)


if __name__ == '__main__':
    main()
