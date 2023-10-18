package arraylist;

public class ArrayList {
	private int[] array;
	private int tamanho;
	public static final int capacidade_final = 20;

	public ArrayList() {
		this.array = new int[capacidade_final];
		this.tamanho = 0;
	}

	public ArrayList(int size) {
		this.array = new int[size];
		this.tamanho = 0;
	}

	public int size() {
		return this.tamanho;
	}

	// diferentes tipos de adição , levando em consideração a posição;
	public boolean add(int v) {
		assegureCapacidade(this.tamanho + 1);
		this.array[this.tamanho++] = v;
		return true;

	}

	public void add(int v, int index) {
		if (index < 0 || index >= this.tamanho)
			throw new IndexOutOfBoundsException();
		assegureCapacidade(this.tamanho + 1);
		shiftparaDireita(index);
		this.array[index] = v;
		this.tamanho++;

	}

	private void shiftparaDireita(int index) {
		if (index == this.array.length - 1)
			throw new IndexOutOfBoundsException();

		for (int i = this.tamanho; i > index; i--) {
			this.array[i] = this.array[i - 1];
		}

	}

	private void assegureCapacidade(int capacidadePretendida) {
		if (capacidadePretendida > this.tamanho) {
			resize(Math.max(this.array.length * 2, capacidadePretendida));
		}

	}

	private void resize(int max) {
		int[] novalist = new int[max];
		for (int i = 0; i < this.array.length; i++)
			novalist[i] = this.array[i];
		this.array = novalist;

	}

	public boolean isEmpty() {
		return this.tamanho == 0;
	}

	public int get(int i) {
		if (i > this.array.length - 1 || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		return this.array[i];
	}

	public int remove(int index) {
		if (index > this.array.length - 1 || index < 0) {
			throw new IllegalArgumentException();
		}
		int v = this.get(index);
		shiftParaEsquerda(index);
		this.tamanho--;
		return v;
	}

	public boolean remove1(int value) throws Exception {
		if (!contains(value)) {
			throw new Exception();
		}shiftParaEsquerda(this.indexOf(value));
		return true;

	}

	public int indexOf(int value) {
		for (int i = 0; i < tamanho; i++)
			if (this.array[i] == value)
				return i;
		return -1;
	}

	public boolean contains(int value) {
		return indexOf(value) != -1;}

	private void shiftParaEsquerda(int index) {
		 for (int i = index; i < this.tamanho - 1; i++) {
		            this.array[i] = this.array[i+1];
		       }
	}
		    
			
		
	

	// remove o último
	public boolean remove() {
		if (isEmpty()) {
			throw new IllegalArgumentException();}
			this.array[this.tamanho] = 0;
			return true;
		}
	}


