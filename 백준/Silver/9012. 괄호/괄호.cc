#include <iostream>
#include <stack>
#include <string>

using namespace std;

int main() {

	int t;
	cin >> t;

	while (t--) {
		
		int cnt = 0;
		stack<char> s;
		string str;
		cin >> str;

		for (char ch : str) {



			if (ch == '(') {
				
				cnt++;
				s.push(ch);
			}

			else {

				cnt--;

				if (s.empty())
					break;

				s.pop();
			}
		}

		if (cnt == 0) {

			cout << "YES" << endl;
		}

		else {
			
			cout << "NO" << endl;
		}
	}


	return 0;
}